class BankBCA extends Bank {


    void sukuBunga() {
        System.out.println("Suku bunga Bank BCA adalah 4.5%");
    }

    
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan +
                " di bank " + bankTujuan + " (BCA)");
    }
}