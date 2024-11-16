namespace Trojmian
{
    partial class wndOkno
    {

        public Model modelDanych;

        /// <summary>
        /// Wymagana zmienna projektanta.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Wyczyść wszystkie używane zasoby.
        /// </summary>
        /// <param name="disposing">prawda, jeżeli zarządzane zasoby powinny zostać zlikwidowane; Fałsz w przeciwnym wypadku.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Kod generowany przez Projektanta formularzy systemu Windows

        /// <summary>
        /// Metoda wymagana do obsługi projektanta — nie należy modyfikować
        /// jej zawartości w edytorze kodu.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.textBoxA = new System.Windows.Forms.TextBox();
            this.textBoxB = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.textBoxC = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.btCalculate = new System.Windows.Forms.Button();
            this.btClose = new System.Windows.Forms.Button();
            this.textBoxResult = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(34, 29);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(88, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Współczynnik A:";
            // 
            // textBoxA
            // 
            this.textBoxA.Location = new System.Drawing.Point(25, 45);
            this.textBoxA.Name = "textBoxA";
            this.textBoxA.Size = new System.Drawing.Size(156, 20);
            this.textBoxA.TabIndex = 1;
            // 
            // textBoxB
            // 
            this.textBoxB.Location = new System.Drawing.Point(25, 113);
            this.textBoxB.Name = "textBoxB";
            this.textBoxB.Size = new System.Drawing.Size(156, 20);
            this.textBoxB.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(34, 97);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(88, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Współczynnik B:";
            // 
            // textBoxC
            // 
            this.textBoxC.Location = new System.Drawing.Point(25, 180);
            this.textBoxC.Name = "textBoxC";
            this.textBoxC.Size = new System.Drawing.Size(156, 20);
            this.textBoxC.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(34, 164);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(88, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Współczynnik C:";
            // 
            // btCalculate
            // 
            this.btCalculate.BackColor = System.Drawing.Color.Lime;
            this.btCalculate.Font = new System.Drawing.Font("Microsoft Sans Serif", 25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(238)));
            this.btCalculate.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btCalculate.Location = new System.Drawing.Point(56, 288);
            this.btCalculate.Name = "btCalculate";
            this.btCalculate.Size = new System.Drawing.Size(300, 150);
            this.btCalculate.TabIndex = 6;
            this.btCalculate.Text = "Oblicz";
            this.btCalculate.UseVisualStyleBackColor = false;
            this.btCalculate.Click += new System.EventHandler(this.btCalculate_Click);
            // 
            // btClose
            // 
            this.btClose.BackColor = System.Drawing.Color.Red;
            this.btClose.Font = new System.Drawing.Font("Microsoft Sans Serif", 25F, System.Drawing.FontStyle.Bold);
            this.btClose.ForeColor = System.Drawing.SystemColors.ControlLightLight;
            this.btClose.Location = new System.Drawing.Point(457, 288);
            this.btClose.Name = "btClose";
            this.btClose.Size = new System.Drawing.Size(300, 150);
            this.btClose.TabIndex = 7;
            this.btClose.Text = "Zamknij";
            this.btClose.UseVisualStyleBackColor = false;
            this.btClose.Click += new System.EventHandler(this.btClose_Click);
            // 
            // textBoxResult
            // 
            this.textBoxResult.BackColor = System.Drawing.Color.Black;
            this.textBoxResult.Font = new System.Drawing.Font("Microsoft Sans Serif", 25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(238)));
            this.textBoxResult.ForeColor = System.Drawing.SystemColors.Window;
            this.textBoxResult.Location = new System.Drawing.Point(458, 45);
            this.textBoxResult.Multiline = true;
            this.textBoxResult.Name = "textBoxResult";
            this.textBoxResult.Size = new System.Drawing.Size(299, 155);
            this.textBoxResult.TabIndex = 8;
            // 
            // wndOkno
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.textBoxResult);
            this.Controls.Add(this.btClose);
            this.Controls.Add(this.btCalculate);
            this.Controls.Add(this.textBoxC);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.textBoxB);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.textBoxA);
            this.Controls.Add(this.label1);
            this.Name = "wndOkno";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textBoxA;
        private System.Windows.Forms.TextBox textBoxB;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox textBoxC;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btCalculate;
        private System.Windows.Forms.Button btClose;
        private System.Windows.Forms.TextBox textBoxResult;
    }
}

