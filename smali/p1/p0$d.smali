.class public final Lp1/p0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/q0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp1/p0;->z(Lp1/u$e;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp1/p0;

.field final synthetic b:Lp1/u$e;


# direct methods
.method constructor <init>(Lp1/p0;Lp1/u$e;)V
    .locals 0

    iput-object p1, p0, Lp1/p0$d;->a:Lp1/p0;

    iput-object p2, p0, Lp1/p0$d;->b:Lp1/u$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Lp0/s;)V
    .locals 2

    iget-object v0, p0, Lp1/p0$d;->a:Lp1/p0;

    iget-object v1, p0, Lp1/p0$d;->b:Lp1/u$e;

    invoke-virtual {v0, v1, p1, p2}, Lp1/p0;->I(Lp1/u$e;Landroid/os/Bundle;Lp0/s;)V

    return-void
.end method
