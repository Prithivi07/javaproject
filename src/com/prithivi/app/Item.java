package com.prithivi.app;

public class Item {
        private String prdName;
        private String prdDesp;
        private String prdPrice;
        private int quantity;

        public Item(String prdName, String prdDesp, String prdPrice, int quantity) {
            this.prdName = prdName;
            this.prdDesp = prdDesp;
            this.prdPrice = prdPrice;
            this.quantity = quantity;
        }

        public String getPrdName() {
            return prdName;
        }

        public String getPrdDesp() {
            return prdDesp;
        }

        public String getPrdPrice() {
            return prdPrice;
        }

        public int getQuantity() {
            return quantity;
        }
}
