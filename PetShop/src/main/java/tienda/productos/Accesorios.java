package tienda.productos;

public class Accesorios extends Producto {

        //Attribute
        private String categoria;


        //Constructor
        public Accesorios() { }
        public Accesorios(String nombre, double precioUnit, int cantStock, boolean disponible, String categoria) {
            super(nombre, precioUnit, cantStock, disponible);
            this.categoria = categoria;
        }


        //Methods
        @Override
        public String toString() {
            return  " *PRODUCTO: ACCESORIOS: " +
                    super.toString()+
                    " 8" +
                    "Categoria: "  +this.categoria;
        }

        //Gets and Sets
        public String getCategoria() {
            return categoria;
        }
        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }
    }





