import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactusComponent } from './contactus/contactus.component';
import { PortfoliosComponent } from './portfolios/portfolios.component';
import { LoginComponent } from './login/login.component';
import { AboutComponent } from './about/about.component';
import { CustomerComponent } from './customer/customer.component';
import { TermsComponent } from './terms/terms.component';
import { PartnerComponent } from './partner/partner.component';
import { UserComponent } from './user/user.component';
import { EventsComponent } from './events/events.component';
import { MoreComponent } from './more/more.component';
import { LogoutComponent } from './logout/logout.component';
import { AppComponent } from './app.component';
import { PaymentComponent } from './payment/payment.component';
import { PdoneComponent } from './pdone/pdone.component';
import { Payment1Component } from './payment1/payment1.component';
import { Payment2Component } from './payment2/payment2.component';
import { Payment3Component } from './payment3/payment3.component';
import { Payment4Component } from './payment4/payment4.component';
import { Payment5Component } from './payment5/payment5.component';
import { Payment6Component } from './payment6/payment6.component';
import { Payment7Component } from './payment7/payment7.component';
import { Payment8Component } from './payment8/payment8.component';
import { Payment9Component } from './payment9/payment9.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},

    {path:'app-about',component:AboutComponent},
    {path:'app-contactus',component:ContactusComponent},
    {path:'app-portfolios',component:PortfoliosComponent},
    {path:'app-login',component:LoginComponent},
    {path:'app-customer',component:CustomerComponent},
    {path:'app-terms',component:TermsComponent},
    {path:'app-partner',component:PartnerComponent},
    {path:'app-user',component:UserComponent},
    {path:'app-events',component:EventsComponent},
    {path:'app-more',component:MoreComponent},
    {path:'app-logout',component:LogoutComponent},
    {path:'app-ghar',component:AppComponent},
    {path:'app-payment',component:PaymentComponent},
    {path:'app-pdone',component:PdoneComponent},
    {path:'app-payment1',component:Payment1Component},
    {path:'app-payment2',component:Payment2Component},
    {path:'app-payment3',component:Payment3Component},
    {path:'app-payment4',component:Payment4Component},
    {path:'app-payment5',component:Payment5Component},
    {path:'app-payment6',component:Payment6Component},
    {path:'app-payment7',component:Payment7Component},
    {path:'app-payment8',component:Payment8Component},
    {path:'app-payment9',component:Payment9Component}
];
