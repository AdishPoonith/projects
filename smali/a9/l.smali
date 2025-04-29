.class public La9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;
.implements Li8/a;
.implements Lj8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/l$a;
    }
.end annotation


# instance fields
.field private j:La9/l$a;

.field private k:Lr8/k;

.field private l:Lj8/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lj8/c;)V
    .locals 1

    iput-object p1, p0, La9/l;->l:Lj8/c;

    iget-object v0, p0, La9/l;->j:La9/l$a;

    invoke-interface {p1, v0}, Lj8/c;->b(Lr8/m;)V

    iget-object v0, p0, La9/l;->j:La9/l$a;

    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, La9/l$a;->C(Landroid/app/Activity;)V

    return-void
.end method

.method private b()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, La9/l;->j:La9/l$a;

    iget-object v1, p0, La9/l;->k:Lr8/k;

    invoke-virtual {v1, v0}, Lr8/k;->e(Lr8/k$c;)V

    iput-object v0, p0, La9/l;->k:Lr8/k;

    return-void
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, La9/l;->l:Lj8/c;

    iget-object v1, p0, La9/l;->j:La9/l$a;

    invoke-interface {v0, v1}, Lj8/c;->g(Lr8/m;)V

    iget-object v0, p0, La9/l;->j:La9/l$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La9/l$a;->C(Landroid/app/Activity;)V

    iput-object v1, p0, La9/l;->l:Lj8/c;

    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 10

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "signOut"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "requestScopes"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_2
    const-string v1, "getTokens"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_3
    const-string v1, "disconnect"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_4
    const-string v1, "clearAuthCache"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_5
    const-string v1, "init"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_6
    const-string v1, "isSignedIn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_7
    const-string v1, "signInSilently"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_8
    const-string v1, "signIn"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x0

    :goto_0
    const-string v0, "scopes"

    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lr8/k$d;->c()V

    goto/16 :goto_1

    :pswitch_0
    iget-object p1, p0, La9/l;->j:La9/l$a;

    invoke-virtual {p1, p2}, La9/l$a;->F(Lr8/k$d;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, La9/l;->j:La9/l$a;

    invoke-virtual {v0, p2, p1}, La9/l$a;->B(Lr8/k$d;Ljava/util/List;)V

    goto/16 :goto_1

    :pswitch_2
    const-string v0, "email"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "shouldRecoverAuth"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, La9/l;->j:La9/l$a;

    invoke-virtual {v1, p2, v0, p1}, La9/l$a;->q(Lr8/k$d;Ljava/lang/String;Z)V

    goto/16 :goto_1

    :pswitch_3
    iget-object p1, p0, La9/l;->j:La9/l$a;

    invoke-virtual {p1, p2}, La9/l$a;->l(Lr8/k$d;)V

    goto :goto_1

    :pswitch_4
    const-string v0, "token"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La9/l;->j:La9/l$a;

    invoke-virtual {v0, p2, p1}, La9/l$a;->k(Lr8/k$d;Ljava/lang/String;)V

    goto :goto_1

    :pswitch_5
    const-string v1, "signInOption"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    const-string v0, "hostedDomain"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    const-string v0, "clientId"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    const-string v0, "serverClientId"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    const-string v0, "forceCodeForRefreshToken"

    invoke-virtual {p1, v0}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    iget-object v2, p0, La9/l;->j:La9/l$a;

    move-object v3, p2

    invoke-virtual/range {v2 .. v9}, La9/l$a;->r(Lr8/k$d;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    :pswitch_6
    iget-object p1, p0, La9/l;->j:La9/l$a;

    invoke-virtual {p1, p2}, La9/l$a;->s(Lr8/k$d;)V

    goto :goto_1

    :pswitch_7
    iget-object p1, p0, La9/l;->j:La9/l$a;

    invoke-virtual {p1, p2}, La9/l$a;->E(Lr8/k$d;)V

    goto :goto_1

    :pswitch_8
    iget-object p1, p0, La9/l;->j:La9/l$a;

    invoke-virtual {p1, p2}, La9/l$a;->D(Lr8/k$d;)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x35ca943e -> :sswitch_8
        -0x260b317c -> :sswitch_7
        -0x1cb23755 -> :sswitch_6
        0x316510 -> :sswitch_5
        0x1705aed -> :sswitch_4
        0x1f9d589c -> :sswitch_3
        0x3157a890 -> :sswitch_2
        0x52b6040e -> :sswitch_1
        0x7c782451 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Li8/a$b;)V
    .locals 0

    invoke-direct {p0}, La9/l;->b()V

    return-void
.end method

.method public e(Lj8/c;)V
    .locals 0

    invoke-direct {p0, p1}, La9/l;->a(Lj8/c;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 0

    invoke-direct {p0, p1}, La9/l;->a(Lj8/c;)V

    return-void
.end method

.method public g()V
    .locals 0

    invoke-direct {p0}, La9/l;->c()V

    return-void
.end method

.method public h(Lr8/c;Landroid/content/Context;La9/m;)V
    .locals 2

    new-instance v0, Lr8/k;

    const-string v1, "plugins.flutter.io/google_sign_in_android"

    invoke-direct {v0, p1, v1}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object v0, p0, La9/l;->k:Lr8/k;

    new-instance p1, La9/l$a;

    invoke-direct {p1, p2, p3}, La9/l$a;-><init>(Landroid/content/Context;La9/m;)V

    iput-object p1, p0, La9/l;->j:La9/l$a;

    iget-object p1, p0, La9/l;->k:Lr8/k;

    invoke-virtual {p1, p0}, Lr8/k;->e(Lr8/k$c;)V

    return-void
.end method

.method public j()V
    .locals 0

    invoke-direct {p0}, La9/l;->c()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 2

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object v0

    invoke-virtual {p1}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    new-instance v1, La9/m;

    invoke-direct {v1}, La9/m;-><init>()V

    invoke-virtual {p0, v0, p1, v1}, La9/l;->h(Lr8/c;Landroid/content/Context;La9/m;)V

    return-void
.end method
