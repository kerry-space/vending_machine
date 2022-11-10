package org.example.data;

public enum ECurrency {

        NUMBER_ONE(1),
        NUMBER_TWO(2),
        NUMBER_FIVE(5),
        NUMBER_TEN(10),
        NUMBER_TWENTY(20),
        NUMBER_FIFTIETH(50),
        NUMBER_HUNDRED(100),
        NUMBER_TWOHUNDRED(200),
        NUMBER_FIVEHUNDRED(500),
        NUMBER_THOUSAND(100);

        //fields to storing the state
        private int moneyStaorage;

        //Constructor need to be private. It gets called internally
        private ECurrency(int money) {
                this.moneyStaorage = money;
        }


        public void setMoneyStaorage(int moneyStaorage) {
                this.moneyStaorage = moneyStaorage;
        }

        public int getMoneyStaorage() {
                return moneyStaorage;
        }
}
