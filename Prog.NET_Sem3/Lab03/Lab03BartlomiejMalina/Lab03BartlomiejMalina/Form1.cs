using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.VisualStyles;

namespace Lab03BartlomiejMalina
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void Form1_Paint(object sender, PaintEventArgs e)
        {
            Graphics g = e.Graphics;
            //g.DrawString("Hello world!", new Font("Times New Roman", 20), 
            //    new SolidBrush(System.Drawing.Color.Red), 0, 0); 
            // g.DrawLine(new Pen(new SolidBrush(System.Drawing.Color.Green)), new Point(10, 50), new Point(100, 50)); // linia pozioma

            // Słońce
            Pen sunPen = new Pen(Color.Yellow, 4);
            g.DrawEllipse(sunPen, 50, 50, 50, 50); // słońce
            g.DrawLine(sunPen, 50, 80, 10, 150); // promienie
            g.DrawLine(sunPen, 60, 50, 30, 10);
            g.DrawLine(sunPen, 100, 80, 120, 100);
            g.DrawLine(sunPen, 100, 60, 110, 30);
            g.DrawLine(sunPen, 80, 50, 80, 20);
            g.DrawLine(sunPen, 80, 100, 80, 180);

            //Ziemia
            Pen groundPen = new Pen(Color.LawnGreen, 3);
            g.DrawLine(groundPen, 50, 650, 950, 650); // ziemia

            //Dom
            Pen housePen = new Pen(Color.Black, 3);
            g.DrawRectangle(housePen, 150, 348, 400, 300); // Dom

            g.DrawRectangle(housePen, 180, 450, 90, 100); // okno lewe
            g.DrawLine(housePen, 180, 500, 270, 500); //framugi
            g.DrawLine(housePen, 225, 450, 225, 550);


            g.DrawRectangle(housePen, 420, 450, 90, 100); // okno prawe
            g.DrawLine(housePen, 420, 500, 510, 500); //framugi
            g.DrawLine(housePen, 465, 450, 465, 550);

            g.DrawRectangle(housePen, 300, 450, 90, 195); // drzwi
            g.DrawLine(housePen, 310, 550, 325, 548); // klamka


            //Dach
            Pen roofPen = new Pen(Color.Red, 3);

            Point[] points =
             {
                new Point(100,  348),
                new Point(600, 348),
                new Point(500,  250),
                new Point(200, 250),
                new Point(100,348)
             };

            g.DrawLines(roofPen, points);

            //komin
            g.DrawRectangle(housePen, 325, 210, 30, 40);

            //łodyga
            Pen vegetationPen = new Pen(Color.ForestGreen, 2);

            Point[] points2 =
            {
                new Point(600, 650),
                new Point(602, 640),
                new Point(620, 600),
            };

            g.DrawCurve(vegetationPen, points2);

            //kwiat
            Pen flowerPen = new Pen(Color.Red,2);

            Point[] points3 =
            {
                new Point(605,580),
                new Point(610,600),
                new Point(620,603),
                new Point(630,600),
                new Point(635,580),
            };

            g.DrawCurve(flowerPen,points3);


            //drzewo
            Pen treePen = new Pen(Color.Brown, 2);
            g.DrawRectangle(treePen, 800, 450, 20, 200);

            //ptak
            Rectangle rectangle = new Rectangle(800, 100,50,30);
            g.DrawArc(housePen, rectangle, 0F, -180F);

            Rectangle rectangle2 = new Rectangle(850, 100, 50, 30);
            g.DrawArc(housePen, rectangle2,180F, 180F);
        }
    }
}
