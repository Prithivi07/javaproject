package com.prithivi.app;

public class Item {
        private String prdName;
        private String prdInfo;
        private String prdPrice;
        private int quantity;

        public Item(String prdName, String prdDesp, String prdPrice, int quantity) {
            this.prdName = prdName;
            this.prdInfo = prdDesp;
            this.prdPrice = prdPrice;
            this.quantity = quantity;
        }

        public String getPrdName() {
            return prdName;
        }

        public String getPrdInfo() {
            return prdInfo;
        }

        public String getPrdPrice() {
            return prdPrice;
        }

        public int getQuantity() {
            return quantity;
        }

        public void updPrdInfo(String info){
            this.prdInfo = info;
        }
        public void updPrdPrice(String price){
            this.prdPrice = price;
        }
}
