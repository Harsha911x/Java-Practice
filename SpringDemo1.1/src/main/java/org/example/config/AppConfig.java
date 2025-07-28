package org.example.config;



import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;


import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("org.example")
public class AppConfig {



//    @Bean
//    //public Alien alien(@Qualifier("laptop") Computer com) {   use this or @Primary
//    public Alien alien(Computer com) {
//        Alien obj= new Alien();
//        obj.setAge(25);
//        obj.setCom(com);
//        return obj;
//
//    }
//
//
////	@Bean(name = {"Beast","desktop","com1"})
//
//    @Bean
//    @Primary
//    //@Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//
//    public Laptop laptop(){
//
//        return new Laptop();
//    }
//

}

