﻿using System;
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
        Func<>
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
            int X1 = int.Parse(textBox1.Text);
            int X2 = int.Parse(textBox2.Text);
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
            chart1.Titles.Add("y = cos(x) + 0.2 * x");

            Series series = new Series
            {
                Name = "wykres",
                Color = Color.Blue,
                ChartType = SeriesChartType.Line

            };
            for(double i = X1; i <= X2; i += 0.001)
            {
                series.Points.AddXY(i, funkcja);
            }
            chart1.Series.Add(series);

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void chart1_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            chart1.ChartAreas[0].AxisY.MajorGrid.Enabled = checkBox2.Checked;
        }

        private void checkedListBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}