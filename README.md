<h1>Bank Application</h1><p>This is a simple Spring Boot application for managing bank accounts, customers, and transactions.</p><h2>Table of Contents</h2><ol><li><a href="#controllers" target="_new">Controllers</a><ul><li><a href="#accountcontroller" target="_new">AccountController</a></li><li><a href="#customercontroller" target="_new">CustomerController</a></li><li><a href="#transactioncontroller" target="_new">TransactionController</a></li></ul></li><li><a href="#dependencies" target="_new">Dependencies</a></li><li><a href="#configuration" target="_new">Configuration</a></li></ol><h2>Controllers</h2><h3>AccountController</h3><ul><li><p><strong>View summary of account</strong></p><ul><li><strong>Endpoint:</strong> <code>GET /api/accounts/{IBAN}</code></li><li><strong>Description:</strong> Retrieve a summary of the account using the provided IBAN.</li></ul></li><li><p><strong>Create account</strong></p><ul><li><strong>Endpoint:</strong> <code>POST /api/accounts</code></li><li><strong>Description:</strong> Create a new bank account.</li></ul></li><li><p><strong>Delete account</strong></p><ul><li><strong>Endpoint:</strong> <code>DELETE /api/accounts/{IBAN}</code></li><li><strong>Description:</strong> Remove a bank account using the provided IBAN.</li></ul></li><li><p><strong>Modify account</strong></p><ul><li><strong>Endpoint:</strong> <code>PUT /api/accounts/{IBAN}</code></li><li><strong>Description:</strong> Modify an existing bank account using the provided IBAN.</li></ul></li></ul><h3>CustomerController</h3><ul><li><p><strong>Create customer</strong></p><ul><li><strong>Endpoint:</strong> <code>POST /api/customers</code></li><li><strong>Description:</strong> Create a new customer.</li></ul></li><li><p><strong>Delete customer</strong></p><ul><li><strong>Endpoint:</strong> <code>DELETE /api/customers/{customerId}</code></li><li><strong>Description:</strong> Remove a customer using the provided customer ID.</li></ul></li><li><p><strong>Modify customer</strong></p><ul><li><strong>Endpoint:</strong> <code>PUT /api/customers/{customerId}</code></li><li><strong>Description:</strong> Modify an existing customer using the provided customer ID.</li></ul></li></ul><h3>TransactionController</h3><ul><li><p><strong>Make transaction</strong></p><ul><li><strong>Endpoint:</strong> <code>POST /api/transactions/transfer</code></li><li><strong>Description:</strong> Make a financial transaction between two accounts.</li></ul></li><li><p><strong>View transaction history</strong></p><ul><li><strong>Endpoint:</strong> <code>GET /api/transactions/history</code></li><li><strong>Description:</strong> Retrieve the transaction history.</li></ul></li><li><p><strong>Search transactions</strong></p><ul><li><strong>Endpoint:</strong> <code>GET /api/transactions/search</code></li><li><strong>Description:</strong> Search for transactions based on amount, IBAN, or message.</li></ul></li></ul><h2>Dependencies</h2><p>The project uses the following dependencies:</p><ul><li><code>spring-boot-starter-data-jpa</code></li><li><code>spring-boot-starter-web</code></li><li><code>spring-boot-starter-test</code></li><li><code>postgresql</code></li></ul><h2>Configuration</h2><p>The application is configured to connect to a PostgreSQL database. Configuration details can be found in the <code>application.properties</code> file.</p><pre><div class="bg-black rounded-md" bis_skin_checked="1"><div class="flex items-center relative text-gray-200 bg-gray-800 gizmo:dark:bg-token-surface-primary px-4 py-2 text-xs font-sans justify-between rounded-t-md" bis_skin_checked="1"><span>properties</span><button class="flex ml-auto gizmo:ml-0 gap-2 items-center"><svg width="24" height="24" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg" class="icon-md"><path fill-rule="evenodd" clip-rule="evenodd" d="M12 4C10.8954 4 10 4.89543 10 6H14C14 4.89543 13.1046 4 12 4ZM8.53513 4C9.22675 2.8044 10.5194 2 12 2C13.4806 2 14.7733 2.8044 15.4649 4H17C18.6569 4 20 5.34315 20 7V19C20 20.6569 18.6569 22 17 22H7C5.34315 22 4 20.6569 4 19V7C4 5.34315 5.34315 4 7 4H8.53513ZM8 6H7C6.44772 6 6 6.44772 6 7V19C6 19.5523 6.44772 20 7 20H17C17.5523 20 18 19.5523 18 19V7C18 6.44772 17.5523 6 17 6H16C16 7.10457 15.1046 8 14 8H10C8.89543 8 8 7.10457 8 6Z" fill="currentColor"></path></svg>Copy code</button></div><div class="p-4 overflow-y-auto" bis_skin_checked="1"><code class="!whitespace-pre hljs language-properties">spring.datasource.url=jdbc:postgresql://localhost:5432/bank
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
spring.thymeleaf.cache=false
</code></div></div></pre><p>Feel free to customize the application according to your specific requirements.</p>