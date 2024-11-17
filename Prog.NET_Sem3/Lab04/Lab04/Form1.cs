using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.DataVisualization.Charting;

namespace Lab04
{
    public partial class Form1 : Form
    {
        ChartArea chartArea = new ChartArea();
        int check;
        double minY, maxY, tempY;
        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {

        }
        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            chart1.ChartAreas[0].AxisX.MajorGrid.Enabled = checkBox1.Checked;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int X1=0, X2=0;

            try
            {
                X1 = int.Parse(textBox1.Text);
                X2 = int.Parse(textBox2.Text);
            } catch (System.FormatException)
            {
                MessageBox.Show("X1 lub X2 nie jest liczbą");
                return;
            }

            if (X1 > X2)
            {
                MessageBox.Show("X2 jest mniejsze od X1");
                return;
            }
            chart1.Titles.Clear();
            chart1.ChartAreas.Clear();
            chart1.Series.Clear();

            // przedział x
            chartArea.AxisX.Minimum = X1;
            chartArea.AxisX.Maximum = X2;
            chartArea.AxisX.Title = textBox4.Text;
            chartArea.AxisY.Title = textBox5.Text;
            chart1.ChartAreas.Add(chartArea);

            chart1.Titles.Add(textBox3.Text);

            Series series = new Series
            {
                Name = "wykres",
                Color = Color.Blue,
                ChartType = SeriesChartType.Line

            };
            minY = 0; maxY = 0;
            for (double i = X1; i <= X2; i += 0.001)
            {
                if (check == 0)
                {
                    tempY = Math.Cos(i) + 0.2 * i;
                    series.Points.AddXY(i, tempY);
                    
                }
                if (check == 1)
                {
                    tempY = Math.Sin(i) + i * i;
                    series.Points.AddXY(i, tempY);
                }
                if (check == 2)
                {
                    tempY = Math.Tan(i) + Math.Log(i);
                    series.Points.AddXY(i, tempY);
                }
                if (check == 3)
                {
                    tempY = Math.Sin(i)/i;
                    series.Points.AddXY(i, tempY);
                }
                if (tempY < minY)
                    minY = Convert.ToInt32(tempY);
                if(tempY > maxY) 
                    maxY = Convert.ToInt32(tempY);
                chartArea.AxisY.Minimum = Convert.ToInt32(minY) - 1;
                chartArea.AxisY.Maximum = Convert.ToInt32(maxY) + 1;

            }
            chart1.Series.Add(series);

        }

        
        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            chart1.ChartAreas[0].AxisY.MajorGrid.Enabled = checkBox2.Checked;
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
             check = listBox1.SelectedIndex;
        }
    }
}
