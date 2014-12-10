import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Prueba {

	public static void main(String[] args) {

		try {

			ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
			FileInputStream fis = new FileInputStream("./distribuidores.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
			BufferedReader br = new BufferedReader(isr);

			String linea = br.readLine();
			String [] campos = null;

			while(linea != null) {
				Distribuidor distribuidor = new Distribuidor();
				Direccion direccion = new Direccion();
				Contacto contacto = new Contacto();
				
				campos = linea.split("#");
				String distri = campos[0];
				String [] campos2 = distri.split(",");
				
				distribuidor.setNombre(campos2[0]);
				distribuidor.setCif(campos2[1]);
				
				distri = campos[1];
				campos2 = distri.split(",");

				direccion.setCiudad(campos2[0]);
				direccion.setCalle(campos2[1]);

				int entero = Integer.parseInt(campos2[2]);
				direccion.setNumero(entero);
				entero = Integer.parseInt(campos2[3]);
				direccion.setPiso(entero);
				char [] arr = (campos2[4]).toCharArray();
				direccion.setLetra(arr[0]);
				entero = Integer.parseInt(campos2[5]);
				direccion.setCodPostal(entero);

				distribuidor.setDireccion(direccion);

				distri = campos[2];
				campos2 = distri.split(",");
				contacto.setNombre(campos2[0]);
				contacto.setApellido(campos2[1]);
				contacto.setEmail(campos2[2]);
				entero = Integer.parseInt(campos2[3]);
				contacto.setTelefono(entero);

				distribuidor.setContacto(contacto);

				distribuidores.add(distribuidor);
				linea = br.readLine();
			}

			for(int i=0; i < distribuidores.size(); i++) {
			Direccion direc = new Direccion();
			Contacto contact = new Contacto();
			System.out.println("\nProveedor nº: " + (i + 1));
			System.out.println("*************************************************");
			System.out.println("Nombre: " + (distribuidores.get(i).getNombre()));
			System.out.println("Cif: " + (distribuidores.get(i).getCif()));
			direc = distribuidores.get(i).getDireccion();
			System.out.println("Direccion: ");
			System.out.println("\tCiudad: " + direc.getCiudad());
			System.out.println("\tCalle: " + direc.getCalle());
			System.out.println("\tNúmero: " + direc.getNumero());
			System.out.println("\tPiso: " + direc.getPiso());
			System.out.println("\tLetra: " + direc.getLetra());
			System.out.println("\tCod.postal: " + direc.getCodPostal());
			contact = distribuidores.get(i).getContacto();
			System.out.println("Contacto: ");
			System.out.println("\tNombre: " + contact.getNombre());
			System.out.println("\tApellido: " + contact.getApellido());
			System.out.println("\tE-mail: " + contact.getEmail());
			System.out.println("\tTeléfono: " + contact.getTelefono());
			System.out.println("*************************************************");
			}


		}catch(Exception ioe) {
			System.out.println("Error: "+ioe);
		}


	}
}