class OperateRadio 
{
    public static void main(String[] args) 
    {
        Battery nanfu = new Battery(100);                   //������ض���
        System.out.println("���ڵ�صĴ������ǣ�" + nanfu.electricityAmount);

        Radio radio = new Radio();                          //��������������
        System.out.println("��������ʼʹ�����ڵ��");
        radio.openRadio(nanfu);                             //��������
        System.out.println("Ŀǰ���ڵ�صĴ������ǣ�" + nanfu.electricityAmount);
    }
}
