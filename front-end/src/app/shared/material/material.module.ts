import { NgModule } from '@angular/core';
import { MatButtonModule, MatCardModule, MatExpansionModule,
    MatIconModule, MatMenuModule, MatTableModule, MatToolbarModule } from '@angular/material';
@NgModule({
    imports: [
        MatButtonModule,
        MatMenuModule,
        MatToolbarModule,
        MatIconModule,
        MatCardModule,
        MatTableModule,
        MatExpansionModule
    ],
    exports: [
        MatButtonModule,
        MatMenuModule,
        MatToolbarModule,
        MatIconModule,
        MatCardModule,
        MatTableModule,
        MatExpansionModule,
    ]
})
export class MaterialModule { }
