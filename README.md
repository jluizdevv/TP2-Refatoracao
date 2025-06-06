🦜 Parrot Refactoring Kata
Este projeto é baseado no Parrot Refactoring Kata, que simula comportamentos de diferentes tipos de papagaios. O objetivo foi refatorar o código original para torná-lo mais organizado, coeso e fácil de manter.

🧾 Descrição do Projeto Original
A classe Parrot original continha lógicas específicas para diferentes tipos de papagaios (Europeu, Africano, Azul Norueguês), com muitos if e switch, violando o princípio da responsabilidade única (SRP).

🔧 Melhorias Realizadas
Criação da interface ParrotBehavior para encapsular o comportamento dos papagaios.

Novas classes específicas: EuropeanParrotBehavior, AfricanParrotBehavior, NorwegianBlueParrotBehavior.

Classe ParrotStatus para armazenar o estado específico de cada papagaio.

Factory ParrotBehaviorFactory para instanciar o comportamento correto.

Classe Parrot agora delega para ParrotBehavior os métodos getSpeed() e getCry().

💡 Justificativas Técnicas
Aplicação dos princípios SRP e OCP (Aberto para extensão, fechado para modificação).

Redução do acoplamento e aumento da coesão.

Código mais modular, testável e pronto para extensões futuras.

✅ Testes
Todos os testes foram mantidos e estão passando, garantindo que o comportamento original foi preservado após a refatoração.


📘 Relatório de Refatoração
No projeto, percebi que a classe Parrot estava acumulando muitas responsabilidades, o que deixava o código confuso e difícil de manter. Por isso, dividi os comportamentos específicos de cada tipo de papagaio em classes separadas, deixando tudo mais organizado.

Criei uma fábrica para cuidar da criação desses comportamentos, facilitando a inclusão de novos tipos no futuro sem mudar o código existente.

Tive um pouco de trabalho para ajustar os testes e garantir que a lógica dos papagaios, principalmente do Norwegian Blue, continuasse funcionando corretamente.

Com essa experiência, aprendi como separar responsabilidades ajuda a manter o código mais claro e fácil de entender, além de mostrar a importância dos testes para garantir que nada quebre durante mudanças.
