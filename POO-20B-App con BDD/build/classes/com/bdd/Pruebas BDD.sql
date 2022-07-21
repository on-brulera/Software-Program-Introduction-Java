/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  MacArthur
 * Created: 26/01/2021
 */

-- Insert en BDD
insert into producto values (1,"Mouse",5);
insert into producto values (2,"Teclado",15);
insert into producto values (3,"Pantalla",125);
insert into producto values (4,"Portatil",500);
insert into producto (id,precio ) values (5,5);

-- Select en DBB
select * from producto where id >= 3;
select * from producto;

-- Update en BDD
update producto set nombre = "Impresora", precio = precio * 1.1 where id >= 1;
update producto set nombre = "Impresora" where id = 5;

-- Delete en BDD
delete from producto where precio < 100 and id >= 1;
delete from producto where nombre='Mouse';

commit
