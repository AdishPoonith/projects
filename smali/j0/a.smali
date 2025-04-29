.class public Lj0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lp1/e0;

.field b:Lj0/b;


# direct methods
.method constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lp1/e0;->j()Lp1/e0;

    move-result-object v0

    iput-object v0, p0, Lj0/a;->a:Lp1/e0;

    invoke-static {}, Lp0/n$a;->a()Lp0/n;

    move-result-object v1

    new-instance v2, Lj0/b;

    invoke-direct {v2, v1}, Lj0/b;-><init>(Lp0/n;)V

    iput-object v2, p0, Lj0/a;->b:Lj0/b;

    invoke-virtual {v0, v1, v2}, Lp1/e0;->s(Lp0/n;Lp0/p;)V

    return-void
.end method

.method static b(Lp0/a;)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp0/a;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj0/a$c;

    invoke-direct {v0, p0}, Lj0/a$c;-><init>(Lp0/a;)V

    return-object v0
.end method


# virtual methods
.method a(Landroid/app/Activity;Lr8/k$d;)V
    .locals 2

    invoke-static {}, Lp1/e0;->j()Lp1/e0;

    move-result-object v0

    new-instance v1, Lj0/a$a;

    invoke-direct {v1, p0, p2}, Lj0/a$a;-><init>(Lj0/a;Lr8/k$d;)V

    invoke-virtual {v0, p1, v1}, Lp1/e0;->w(Landroid/content/Context;Lp0/s0;)V

    return-void
.end method

.method public c(Lr8/k$d;)V
    .locals 1

    invoke-static {}, Lp0/a;->d()Lp0/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp0/a;->z()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {}, Lp0/a;->d()Lp0/a;

    move-result-object v0

    invoke-static {v0}, Lj0/a;->b(Lp0/a;)Ljava/util/HashMap;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/String;Lr8/k$d;)V
    .locals 2

    invoke-static {}, Lp0/a;->d()Lp0/a;

    move-result-object v0

    new-instance v1, Lj0/a$b;

    invoke-direct {v1, p0, p2}, Lj0/a$b;-><init>(Lj0/a;Lr8/k$d;)V

    invoke-static {v0, v1}, Lp0/j0;->B(Lp0/a;Lp0/j0$d;)Lp0/j0;

    move-result-object p2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "fields"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lp0/j0;->H(Landroid/os/Bundle;)V

    invoke-virtual {p2}, Lp0/j0;->l()Lp0/m0;

    return-void
.end method

.method e(Lr8/k$d;)V
    .locals 1

    invoke-static {}, Lp0/a;->d()Lp0/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lj0/a;->a:Lp1/e0;

    invoke-virtual {v0}, Lp1/e0;->o()V

    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method f(Landroid/app/Activity;Ljava/util/List;Lr8/k$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lr8/k$d;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lp0/a;->d()Lp0/a;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lj0/a;->a:Lp1/e0;

    invoke-virtual {v0}, Lp1/e0;->o()V

    :cond_1
    iget-object v0, p0, Lj0/a;->b:Lj0/b;

    invoke-virtual {v0, p3}, Lj0/b;->g(Lr8/k$d;)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Lj0/a;->a:Lp1/e0;

    invoke-virtual {p3, p1, p2}, Lp1/e0;->m(Landroid/app/Activity;Ljava/util/Collection;)V

    :cond_2
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "KATANA_ONLY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "DEVICE_AUTH"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "WEB_ONLY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "NATIVE_ONLY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "DIALOG_ONLY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    sget-object p1, Lp1/t;->q:Lp1/t;

    goto :goto_1

    :pswitch_0
    sget-object p1, Lp1/t;->s:Lp1/t;

    goto :goto_1

    :pswitch_1
    sget-object p1, Lp1/t;->v:Lp1/t;

    goto :goto_1

    :pswitch_2
    sget-object p1, Lp1/t;->t:Lp1/t;

    goto :goto_1

    :pswitch_3
    sget-object p1, Lp1/t;->r:Lp1/t;

    goto :goto_1

    :pswitch_4
    sget-object p1, Lp1/t;->u:Lp1/t;

    :goto_1
    iget-object v0, p0, Lj0/a;->a:Lp1/e0;

    invoke-virtual {v0, p1}, Lp1/e0;->A(Lp1/t;)Lp1/e0;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7c8193bd -> :sswitch_4
        -0x158b7d2c -> :sswitch_3
        0x593e1d7 -> :sswitch_2
        0x261781f1 -> :sswitch_1
        0x3eb7c715 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
