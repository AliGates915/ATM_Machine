package Bank_ATM;


interface ATM_Operation_Interface {
    public void view_Balance();

    public void WithDraw_Amount(double withdrawamount);

    public void depositAmount(double depositAmount);

    public void View_Some_Details();
}
