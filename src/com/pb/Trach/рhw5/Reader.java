package com.pb.Trach.рhw5;

public class Reader {

        private String name;
        private int readtiket;
        private String facult;
        private String birthday;
        private String telephon;


        public Reader(String name, int readtiket, String facult, String birthday, String telephon) {
                this.name = name;
                this.readtiket = readtiket;
                this.facult = facult;
                this.birthday = birthday;
                this.telephon = telephon;
        }


        public int getReadtiket() {
                return readtiket;
        }

        public void setReadtiket(int readtiket) {
                this.readtiket = readtiket;
        }

        public String getFacult() {
                return facult;
        }

        public void setFacult(String facult) {
                this.facult = facult;
        }

        public String getBirthday() {
                return birthday;
        }

        public void setBirthday(String birthday) {
                this.birthday = birthday;
        }

        public String getTelephon() {
                return telephon;
        }

        public void setTelephon(String telephon) {
                this.telephon = telephon;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        String student() {
                return "[ФИО: " + name + ", номер чит-го билета: " + readtiket + ", " +
                        "фак-тет: " + facult + ", телефлн: " + telephon + "]";
        }
}
