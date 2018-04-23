CREATE SCHEMA `ticket_sales` ;

CREATE TABLE `ticket_sales`.`ts_ticket_sales` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `observation_date` DATE NOT NULL,
  `number_of_tickets` INT NOT NULL,
  PRIMARY KEY (`id`));

insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-01-01', 450);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-02-01', 551);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-03-01', 621);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-04-01', 865);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-05-01', 793);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-06-01', 612);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-07-01', 1006);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-08-01', 894);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-09-01', 913);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-10-01', 1034);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-11-01', 950);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2010-12-01', 780);

insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-01-01', 750);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-02-01', 551);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-03-01', 721);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-04-01', 965);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-05-01', 793);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-06-01', 812);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-07-01', 1106);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-08-01', 804);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-09-01', 973);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-10-01', 934);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-11-01', 910);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2011-12-01', 790);

insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-01-01', 750);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-02-01', 551);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-03-01', 721);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-04-01', 965);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-05-01', 793);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-06-01', 812);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-07-01', 1106);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-08-01', 804);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-09-01', 973);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-10-01', 934);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-11-01', 910);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2012-12-01', 790);

insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-01-01', 751);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-02-01', 552);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-03-01', 722);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-04-01', 966);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-05-01', 794);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-06-01', 811);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-07-01', 1186);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-08-01', 813);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-09-01', 602);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-10-01', 933);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-11-01', 911);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2013-12-01', 799);

insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-01-01', 750);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-02-01', 551);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-03-01', 721);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-04-01', 965);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-05-01', 793);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-06-01', 812);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-07-01', 1106);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-08-01', 804);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-09-01', 973);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-10-01', 934);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-11-01', 910);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2014-12-01', 790);

insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-01-01', 750);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-02-01', 551);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-03-01', 721);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-04-01', 965);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-05-01', 793);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-06-01', 812);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-07-01', 1106);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-08-01', 804);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-09-01', 973);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-10-01', 934);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-11-01', 910);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2015-12-01', 790);

insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-01-01', 750);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-02-01', 551);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-03-01', 721);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-04-01', 965);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-05-01', 793);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-06-01', 812);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-07-01', 1106);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-08-01', 804);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-09-01', 973);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-10-01', 934);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-11-01', 910);
insert into ts_ticket_sales (observation_date, number_of_tickets) values ('2016-12-01', 790);