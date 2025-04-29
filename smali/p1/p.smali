.class public final synthetic Lp1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/f0$b;


# instance fields
.field public final synthetic a:Lp1/q;

.field public final synthetic b:Lp1/u$e;


# direct methods
.method public synthetic constructor <init>(Lp1/q;Lp1/u$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/p;->a:Lp1/q;

    iput-object p2, p0, Lp1/p;->b:Lp1/u$e;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lp1/p;->a:Lp1/q;

    iget-object v1, p0, Lp1/p;->b:Lp1/u$e;

    invoke-static {v0, v1, p1}, Lp1/q;->B(Lp1/q;Lp1/u$e;Landroid/os/Bundle;)V

    return-void
.end method
