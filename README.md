# DESİGN PATTERNS

SİNGLETON

* LazyInitialization
* Eagerlnitialization

FACTORY

"In this project, I created a design pattern that person two different "person behaviors" with the "person" interface."

(Bu projede "İnsan" interface'i ile iki farklı insan davranışını sergileyen bir tasarım deseni oluşturdum.)-Turkish translation

STRATEGY

"In this project, there are 4 sports sections and 4 sports programs in this section. There are 4 different users available to fit this program. I created a design pattern in which the sports program is determined according to the sports each user wants to do."

(bu projemde 4 adet spor bölümü ve bu bölümde 4 adet spor programı mevcuttur. bu programa uyacak 4 farklı kullanıcı mevcuttur. her kullanıcı yapmak istediği spora göre spor programının belirlendiği bir tasarım deseni oluşturdum.)

RPOXY

Thanks to the "ManagerProxy" I created here, only the person whose authorization is verified in the "ManagerProxy" can access the "Employee Salary" information. If he is not authorized "you do not have access to confidential information!" receives the message. If we wish, we can authorize other "Employees" that we define in the "ManagerProxy" and change the authorized persons as we wish.

(Burada oluşturduğum ManagerProxy sayesinde EmployeeSalary bilgisine sadece ManagerProxy de yetkisi doğrulanmış olan kişi bu bilgilere erişebilir. Eğer ManagerProxy de yetkilendirilmeyen bir kişi bu bilgilere erişmek istediğinde "you do not have access to confidential information!" mesajını alır. Dilersek tanımladığımız diğer Empoyee'ları ManagerProxy de yetkilendirebilir yetkili kişileri dilediğimiz gibi değiştirebiliriz.)

BUİLDER

I have created a tv class with tv property. Then I created a builder class and defined two different tv objects that belong to the same tv brand but have different properties. and I determined the features of these TVs separately. Thanks to the new classes we created, we can eliminate the dependencies of televisions from each other and create and add new televisions with different features as we wish.

(Tv özelliğine sahip bir tv sınıfı oluşturdum. Daha sonra bir builder sınıfı oluşturdum ve aynı tv markasına ait ancak farklı özelliklere sahip iki farklı tv nesnesi tanımladım ve bu televizyonların özelliklerini ayrı ayrı belirledim. Oluşturduğumuz yeni sınıflar sayesinde ise televizyonların birbirlerine olan bağımlılıklarını ortadan kaldırabiliyor ve dilediğimiz gibi farklı özelliklerde yeni televizyonlar oluşturup ekleyebiliyoruz.)


