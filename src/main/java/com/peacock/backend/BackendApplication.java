package com.peacock.backend;

import com.peacock.backend.entities.*;
import com.peacock.backend.enums.Role;
import com.peacock.backend.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.math.BigDecimal;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

@SpringBootApplication

public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean

	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder, ClientRepository clientRepository, ProductRepository productRepository, BillItemRepository billItemRepository, BillRepository billRepository){
		return args -> {



			//bill 1



			//bill1
			Bill bill = new Bill();
			BillItem billItem = new BillItem();
			BillItem billItem2 = new BillItem();
			BillItem billItem3 = new BillItem();



			billItem.setQuantity(2);
			billItem2.setQuantity(1);
			billItem3.setQuantity(7);

			billItem.setBill(bill);
			billItem2.setBill(bill);
			billItem3.setBill(bill);


			bill.setDateFacture(new Date());

			ArrayList<BillItem> temp2 = new ArrayList<>();
			temp2.add(billItem);
			temp2.add(billItem2);
			temp2.add(billItem3);

			bill.setBillItems(temp2);
			billRepository.save(bill);
			billItemRepository.save(billItem2);
			billItemRepository.save(billItem2);
			billItemRepository.save(billItem3);

			//-------------------------------------


			Bill bill2 = new Bill();
			BillItem billItem1 = new BillItem();
			BillItem billItem22 = new BillItem();
			BillItem billItem33 = new BillItem();



			billItem1.setQuantity(11);
			billItem22.setQuantity(23);
			billItem33.setQuantity(3);

			billItem1.setBill(bill2);
			billItem22.setBill(bill2);
			billItem33.setBill(bill2);


			bill2.setDateFacture(new Date());

			ArrayList<BillItem> temp = new ArrayList<>();
			temp.add(billItem1);
			temp.add(billItem22);
			temp.add(billItem33);

			bill2.setBillItems(temp);


			billRepository.save(bill2);
			billItemRepository.save(billItem1);
			billItemRepository.save(billItem22);
			billItemRepository.save(billItem33);

			//---------------------------


			//1 Start of users initialization

			//user 1 with ADMIN role

			User user=new User();
			user.setEmail("admin@gmail.com");
			user.setPassword(passwordEncoder.encode("123"));
			user.setRole(Role.ADMIN.toString());
			System.out.println(user.getRole());
			userRepository.save(user);

			//user 2 with VIEWER role

			System.out.println(user.getRole());
			User user2=new User();
			user2.setEmail("viewer@gmail.com");
			user2.setPassword(passwordEncoder.encode("123"));
			user2.setRole(Role.VIEWER.toString());
			System.out.println(user2.getRole());
			userRepository.save(user2);
			System.out.println(user2.getRole());


			//1 end of users initialization



			//2 Start of clients initialization

			//client 1

			Client client=new Client();
			client.setFirstName("Yassir");
			client.setLastName("Rchi");
			client.setEmail("yassir@gmail.com");
			client.setAddress("Casablanca, Sidi maarouf");
			client.setPhoneNumber("0644985908");
			client.setBills(Collections.singletonList(bill));
			client.setBills(Collections.singletonList(bill));
			clientRepository.save(client);
			bill.setClient(client);
			billRepository.save(bill);



			//client 2
			Client client2=new Client();
			client2.setFirstName("Ahmed");
			client2.setLastName("Abdou");
			client2.setEmail("ahmed@gmail.com");
			client2.setAddress("Agadir, Anza");
			client2.setPhoneNumber("0600000000");
			client2.setBills(Collections.singletonList(bill2));
			clientRepository.save(client2);
			bill2.setClient(client2);
			billRepository.save(bill2);

			//client3
			Client client3=new Client();
			client3.setFirstName("Zakaria");
			client3.setLastName("Hamd");
			client3.setEmail("zakaria@gmail.com");
			client3.setAddress("Tanger, Anza");
			client3.setPhoneNumber("0600000000");
			clientRepository.save(client3);









			//2 end of clients initialization


			//3 Start of products initialization
			//product 1

			Product product=new Product();
			product.setName("Bureau noir");
			product.setDescription("bureau en bois, noir, 1.2M x 0.6M");
			product.setPrice(new BigDecimal(699.99));
			product.setQuantityInStock(40);
			billItem.setProduct(product);

			product.setBillsItems(Collections.singletonList(billItem1));
			productRepository.save(product);
			billItemRepository.save(billItem);

			//product2



			Product product2=new Product();
			product2.setName("Bureau blanc");
			product2.setDescription("bureau en bois, blanc, 1.2M x 0.6M");
			product2.setPrice(new BigDecimal(699.99));
			product2.setQuantityInStock(43);

			productRepository.save(product2);

			//product 3


			Product product3=new Product();
			product3.setName("Chaise en ois");
			product3.setDescription("Chaise en bois, pour bureau");
			product3.setPrice(new BigDecimal(150));
			product3.setQuantityInStock(12);


			productRepository.save(product3);

			//product 4
			Product product4=new Product();
			product4.setName("Chaise En Metal noir");
			product4.setDescription("Chaise en metal, pour bureau");
			product4.setPrice(new BigDecimal(100));
			product4.setQuantityInStock(12);

			productRepository.save(product4);


			//3 end of products initialization

			//4 Start of Bills initialization






			//4 Start of Bills initialization



		};
	}

}
