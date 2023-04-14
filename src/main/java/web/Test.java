//package web;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import web.config.DBConfig;
//import web.config.WebConfig;
//import web.model.User;
//import web.service.UserService;
//import web.service.UserServiceImpl;
//
//public class Test {
//    public static void main(String[] args) {
//
////        UserService userService;
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
//
//        UserService userService = context.getBean(UserService.class);
//
//        User user1 = new User("Nigmat", "Nigmatullin", 2000);
//        User user2 = new User("Nigmatulla", "Nigmatullin", 20000);
//        userService.add(user1);
//        userService.add(user2);
//
////        userService.delete(1);
//
//        user2.setName("Nigga");
//        user2.setLastName("Nigga");
//
//        System.out.println("here is update");
//        userService.update(user2);
//
////        userService.getUserList().forEach(System.out::println);
//
//
//
//    }
//}
