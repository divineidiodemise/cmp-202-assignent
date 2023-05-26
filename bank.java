            WhatDoYouWant.setFont(new Font("Consolas",Font.ITALIC,18));
            WhatDoYouWant.setBounds(70,20,250,40);

            depositCurrent.setFont(new Font("Consolas",Font.ITALIC,18));
            depositCurrent.setFocusable(false);
            depositCurrent.setBounds(70,100,150,40);
            depositCurrent.addActionListener(this);

            withdrawlCurrent.setFont(new Font("Consolas",Font.ITALIC,18));
            withdrawlCurrent.setFocusable(false);
            withdrawlCurrent.setBounds(70,180,150,40);
            withdrawlCurrent.addActionListener(this);

            chooseCurrent.setSize(400,400);
            chooseCurrent.setVisible(true);
            chooseCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            chooseCurrent.setLayout(null);
            chooseCurrent.add(WhatDoYouWant);
            chooseCurrent.add(depositCurrent);
            chooseCurrent.add(withdrawlCurrent);

        }

        public void DepositSavingsWindow() {

            enterDepositSavingsAmountLabel.setFont(new Font("Consolas", Font.ITALIC, 18));
            enterDepositSavingsAmountLabel.setBounds(45, 10, 250, 40);

            amountDepositSavingsLabel.setFont(new Font("Consolas", Font.ITALIC, 18));
            amountDepositSavingsLabel.setBounds(45, 50, 250, 40);

            amountDepositSavings.setFont(new Font("Consolas", Font.ITALIC, 18));
            amountDepositSavings.setBounds(45, 80, 250, 40);

            depositSavingsButton.setFont(new Font("Consolas", Font.ITALIC, 18));
            depositSavingsButton.setFocusable(false);
            depositSavingsButton.setBounds(70, 140, 140, 40);
            depositSavingsButton.addActionListener(this);

            DepositAmountSavings.setSize(400, 400);
            DepositAmountSavings.setVisible(true);
            DepositAmountSavings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            DepositAmountSavings.setLayout(null);
            DepositAmountSavings.add(enterDepositSavingsAmountLabel);
            DepositAmountSavings.add(amountDepositSavingsLabel);
            DepositAmountSavings.add(amountDepositSavings);
            DepositAmountSavings.add(depositSavingsButton);
        }

        public void WithdrawlSavingsWindow() {

            enterWithdrawlSavingsAmountLabel.setFont(new Font("Consolas", Font.ITALIC, 18));
            enterWithdrawlSavingsAmountLabel.setBounds(45, 10, 250, 40);

            amountWithdrawlSavingsLabel.setFont(new Font("Consolas", Font.ITALIC, 18));
            amountWithdrawlSavingsLabel.setBounds(45, 50, 250, 40);

            amountWithdrawlSavings.setFont(new Font("Consolas", Font.ITALIC, 18));
            amountWithdrawlSavings.setBounds(45, 80, 250, 40);

            withdrawlSavingsButton.setFont(new Font("Consolas", Font.ITALIC, 18));
            withdrawlSavingsButton.setFocusable(false);
            withdrawlSavingsButton.setBounds(70, 140, 140, 40);
            withdrawlSavingsButton.addActionListener(this);

            WithdrawlAmountSavings.setSize(400, 400);
            WithdrawlAmountSavings.setVisible(true);
            WithdrawlAmountSavings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            WithdrawlAmountSavings.setLayout(null);
            WithdrawlAmountSavings.add(enterWithdrawlSavingsAmountLabel);
            WithdrawlAmountSavings.add(amountWithdrawlSavings);
            WithdrawlAmountSavings.add(amountWithdrawlSavings);
            WithdrawlAmountSavings.add(withdrawlSavingsButton);
        }

        public void DepositCurrentWindow() {

            enterDepositCurrentAmountLabel.setFont(new Font("Consolas", Font.ITALIC, 18));
            enterDepositCurrentAmountLabel.setBounds(45, 10, 250, 40);

            amountDepositCurrentLabel.setFont(new Font("Consolas", Font.ITALIC, 18));
            amountDepositCurrent.setBounds(45, 50, 250, 40);

            amountDepositCurrent.setFont(new Font("Consolas", Font.ITALIC, 18));
            amountDepositCurrent.setBounds(45, 80, 250, 40);

            depositCurrentButton.setFont(new Font("Consolas", Font.ITALIC, 18));
            depositCurrentButton.setFocusable(false);
            depositCurrentButton.setBounds(70, 140, 140, 40);
            depositCurrentButton.addActionListener(this);

            DepositAmountCurrent.setSize(400, 400);
            DepositAmountCurrent.setVisible(true);
            DepositAmountCurrent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            DepositAmountCurrent.setLayout(null);
            DepositAmountCurrent.add(enterDepositCurrentAmountLabel);
            DepositAmountCurrent.add(amountDepositCurrentLabel);
            DepositAmountCurrent.add(amountDepositCurrent);
            DepositAmountCurrent.add(depositCurrentButton);
        }

        public void WithdrawlCurrentWindow() {

            enterWithdrawlCurrentAmountLabel.setFont(new Font("Consolas", Font.ITALIC, 18));
            enterWithdrawlCurrentAmountLabel.setBounds(45, 10, 250, 40);

            amountWithdrawlCurrentLabel.setFont(new Font("Consolas", Font.ITALIC, 18));
            amountWithdrawlCurrentLabel.setBounds(45, 50, 250, 40);

            amountWithdrawlCurrent.setFont(new Font("Consolas", Font.ITALIC, 18));
