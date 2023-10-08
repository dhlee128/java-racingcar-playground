NEXTSTEP 플레이그라운드. 자동차 경주 구현 (Ver. 2023년 10월)
---
- /domain
    - Car :: Car 객체 생성, 해당 자동차가 전진이 가능여부
- /racingcar
    - Game :: 자동차 경주 start
    - Winner :: 경주 우승자를 판단
- /util
  - Constatns :: 메시지
  - Validator :: 유효성 체크
- /view
    - InputView :: 플레이어게 자동차 이름, 실행 횟수를 요청
    - ResultView :: 게임 결과를 출력

---

TDD
1. 자동차 이름은 5자 이하
2. 자동차 이름은 쉼표(,)를 기준으로 구분
3. 전진하는 조건은 4이상일 경우
4. 자동차 경주 게임을 완료한 후 우승자 판별