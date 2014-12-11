import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class LeeryMostarClientes
{
	
	public static void main(String[] args)
	{

		ArrayList<Cliente> clientes2 = new ArrayList<Cliente>();
					try {
						
						FileInputStream fis = new FileInputStream("./clientes.txt");
						InputStreamReader isr = new InputStreamReader(fis, "UTF8");
						BufferedReader br = new BufferedReader(isr);

						String linea = br.readLine();
						String [] campos = null;
	//leer
						while(linea != null) {
							
							Cliente cliente = new Cliente();
							Direccion direccion = new Direccion();
							campos = linea.split("#");
							String distri = campos[0];
							String [] campos2 = distri.split(",");
							cliente.setNombre(campos2[0]);
							cliente.setApellido(campos2[1]);
							cliente.setDni(campos2[2]);
							//direccion
							distri = campos[1];
							campos2 = distri.split(",");
							direccion.setCiudad(campos2[0]);//ciudad

							int entero = Integer.parseInt(campos2[1]);
							direccion.setCodigoPostal(entero);//codigopostal

							direccion.setCalle(campos2[2]);//calle 

							entero = Integer.parseInt(campos2[3]);
							direccion.setNumero(entero);//numero

							cliente.setDireccion(direccion);

							distri = campos[2];
							campos2 = distri.split(",");
							double doble = Double.parseDouble(campos2[0]);
							cliente.setNum_socio(doble);
							doble = Double.parseDouble(campos2[1]);
							cliente.setDto(doble);

							clientes2.add(cliente);
							linea = br.readLine();
						}

						for (int i=0;i<clientes2.size() ;i++ ) {
							Direccion direcc = new Direccion();

				System.out.println("\ncliente nº: " + (i + 1));
				System.out.println("<><><><><><><><><><><><><><><><><><><><>");
				System.out.println("\nNombre: " + (clientes2.get(i).getNombre()));
				//System.out.println("\nNombre: " + (clientes2.get(i).getApellido()));
				System.out.println("\nDni: " + (clientes2.get(i).getDni()));
				System.out.println("\nnumero de socio: " + (clientes2.get(i).getNum_socio()));
				System.out.println("\ndescuento: " + (clientes2.get(i).getDto()));
				direcc = clientes2.get(i).getDireccion();
				System.out.println("\tCiudad: " + direcc.getCiudad());
			System.out.println("\tCod.postal: " + direcc.getCodigoPostal());
			System.out.println("\tCalle: " + direcc.getCalle());
			System.out.println("\tCalle: " + direcc.getNumero());



						}


					}catch(Exception o){
							System.out.println("Error: "+o);
					}

	}
}