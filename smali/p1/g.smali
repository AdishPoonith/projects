.class public final synthetic Lp1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic j:Lp1/m;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lp1/m$b;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Ljava/util/Date;

.field public final synthetic o:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(Lp1/m;Ljava/lang/String;Lp1/m$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/g;->j:Lp1/m;

    iput-object p2, p0, Lp1/g;->k:Ljava/lang/String;

    iput-object p3, p0, Lp1/g;->l:Lp1/m$b;

    iput-object p4, p0, Lp1/g;->m:Ljava/lang/String;

    iput-object p5, p0, Lp1/g;->n:Ljava/util/Date;

    iput-object p6, p0, Lp1/g;->o:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    iget-object v0, p0, Lp1/g;->j:Lp1/m;

    iget-object v1, p0, Lp1/g;->k:Ljava/lang/String;

    iget-object v2, p0, Lp1/g;->l:Lp1/m$b;

    iget-object v3, p0, Lp1/g;->m:Ljava/lang/String;

    iget-object v4, p0, Lp1/g;->n:Ljava/util/Date;

    iget-object v5, p0, Lp1/g;->o:Ljava/util/Date;

    move-object v6, p1

    move v7, p2

    invoke-static/range {v0 .. v7}, Lp1/m;->Y1(Lp1/m;Ljava/lang/String;Lp1/m$b;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Landroid/content/DialogInterface;I)V

    return-void
.end method
