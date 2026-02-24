package org.example;

    public class ContaBancaria {
        private String titular;
        private double saldo;

        public double getSaldo() {
            return saldo;
        }

        public String getTitular() {
            return titular;
        }

        public ContaBancaria(String titular, double saldo) {
           this.saldo = saldo;
           this.titular = titular;
        }
    public ContaBancaria(){}

    }
