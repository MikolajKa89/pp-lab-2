����   A `
      java/lang/Object <init> ()V  Mikolaj	 
     PracaDomowa imie Ljava/lang/String; �@	 
    numerAlbumu I	 
    miasto LMiasto;  Miasto  Warszawa
     (Ljava/lang/String;)V
 
    ! (Ljava/lang/String;ILMiasto;)V	 # $ % & ' java/lang/System out Ljava/io/PrintStream;
 
 ) * + getImie ()Ljava/lang/String;   - . / makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;
 1 2 3 4  java/io/PrintStream println
 
 6 7 8 getNumerAlbumu ()I  : . ; (I)Ljava/lang/String;
 
 = > ? 	getMiasto 
()LMiasto;
  A B + getNazwa  - Code LineNumberTable setImie setNumerAlbumu (I)V main ([Ljava/lang/String;)V 
SourceFile PracaDomowa.java BootstrapMethods O Twoje imie:  Q Numer albumu:  S 	Miasto:  U
 V W X . Y $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses \ %java/lang/invoke/MethodHandles$Lookup ^ java/lang/invoke/MethodHandles Lookup ! 
                       !  D   P      *� *� 	*� *+� 	*� *-� �    E          
       	  
  * +  D        *� 	�    E         F   D   "     *+� 	�    E   
        7 8  D        *� �    E         G H  D   "     *� �    E   
        > ?  D        *� �    E        	 I J  D   t     H� Y� L� 
Y+� M� ",� (� ,  � 0� ",� 5� 9  � 0� ",� <� @� C  � 0�    E       ! 
 "  # & $ 5 % G &  K    L M     T  N T  P T  R Z   
  [ ] _ 