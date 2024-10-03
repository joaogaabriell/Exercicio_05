public class SubsysWarehouse {

    public int verificarEstoque(String item) {

        return 20;
    }

    public boolean realizarPedidoCompra(String item, int quantidade) {

        System.out.println("Pedido realizado para " + quantidade + " unidades de " + item);
        return true;
    }
}
