using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Trojmian
{
    public partial class wndOkno : Form
    {
        public wndOkno()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {


        }
        private void btClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btCalculate_Click(object sender, EventArgs e)
        {
            bool blad = false;
            // sprawdzanie czy zamiast liczby jest inny znak i przypisanie wartości
            if (!modelDanych.InterpretujA(textBoxA.Text))
            {
                MessageBox.Show("Niewłaściwa wartość współczynnika A");
                blad = true;
                
            }
            if (!modelDanych.InterpretujB(textBoxB.Text))
            {
                MessageBox.Show("Niewłaściwa wartość współczynnika B");
                blad = true;

            }
            if (!modelDanych.InterpretujC(textBoxC.Text))
            {
                MessageBox.Show("Niewłaściwa wartość współczynnika C");
                blad = true;

            }
            if (blad == true){
                return;
            }

            if (modelDanych.A == 0)
            {
                textBoxResult.Text = "A równe 0, równianie liniowe" + "\r\nPierwiastek : " + -modelDanych.C / modelDanych.B;
            } else
            {
                double Delta = modelDanych.obliczDelte();

                if (Delta < 0)
                {
                    textBoxResult.Text = "Delta ujemna, brak wyników";
                }
                else if (Delta == 0)
                {
                    double pierw = modelDanych.pierw1();//(-b + Math.Sqrt(Delta)) / (2 * A);
                    textBoxResult.Text = "Pierwiastek 1: " + pierw.ToString();

                }
                else
                {
                    double pierw1 = modelDanych.pierw1();//(-B + Math.Sqrt(Delta)) / (2 * A);
                    double pierw2 = modelDanych.pierw2();//(-B - Math.Sqrt(Delta)) / (2 * A);
                    textBoxResult.Text = "Pierwiastek 1: " + pierw1.ToString() + "\r\nPierwiastek 2: " + pierw2.ToString();

                }


            }

        }
    }
}
