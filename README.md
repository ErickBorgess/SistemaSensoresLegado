# Sistema de Sensores com Padrões de Projeto GOF

Este projeto é uma refatoração de um sistema legado de sensores embarcados em uma linha de produção inteligente (IoT), utilizando os padrões de projeto GOF com foco em modularidade, reusabilidade e manutenção.

## Objetivo 

Aplicar padrões de criação e padõres estruturais para tornar o sistema mais flexível, desacoplado e pronto para expansão, com uso de sensores de temperatura, umidade e luminosidade.

## 🔧 Padrões Aplicados

### ✅ Factory Method
- Usado para instanciar sensores de forma desacoplada.
- Cada sensor possui uma fábrica concreta (`SensTemperaturaFactory`, `SensUmidadeFactory` e `SensLuminosidadeFactory`).
- Permite adicionar novos sensores sem alterar o `SensorManager`.

### ✅ Singleton
- Aplicado na classe `SensorManager`.
- Garante uma única instância para gerenciar todos os sensores e o display.

### ✅ Adapter
- Permite reutilizar os sensores legados (`SensorTemperatura`, `SensorUmidade` e `SensorLuminosidade`) sem modificá-los.
- Cada sensor foi adaptado com uma classe que implementa `ISensor`.

### ✅ Decorator
- Usado para adicionar comportamentos extras aos sensores **sem alterar sua estrutura**.
- Decoradores implementados:
  - `SensorComLog` → imprime log da leitura
  - `SensorComAlerta` → emite alerta se o valor ultrapassar limite

## 🖥️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-projeto.git

2. Compile os arquivos .java:

3. Execute a aplicação app Main.java

## Benefícios da Refatoração

- Redução de acoplamento: sensores e displays agora seguem interfaces, podendo ser substituídos facilmente.
- Alta coesão: cada classe possui uma única responsabilidade.
- Extensibilidade: novos sensores, displays ou funcionalidades extras podem ser adicionados sem modificar o código existente.
- Reutilização de código legado: com Adapter, os sensores antigos continuam funcionando no sistema novo.

## Estrutura de Pastas
- /SistemaSensoresLegado
-  /lib
-  /src
-    ├── adapter/
-    ├── app/
-    ├── core/
-    ├── decorator/
-    ├── display/
-    ├── factory/
-    └── legacy/
