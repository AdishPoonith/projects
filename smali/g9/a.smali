.class public final Lg9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li8/a;


# instance fields
.field private j:Lr8/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lr8/c;Landroid/content/Context;)V
    .locals 2

    new-instance v0, Lr8/k;

    const-string v1, "PonnamKarthik/fluttertoast"

    invoke-direct {v0, p1, v1}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lg9/a;->j:Lr8/k;

    new-instance p1, Lg9/c;

    invoke-direct {p1, p2}, Lg9/c;-><init>(Landroid/content/Context;)V

    iget-object p2, p0, Lg9/a;->j:Lr8/k;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lr8/k;->e(Lr8/k$c;)V

    :cond_0
    return-void
.end method

.method private final b()V
    .locals 2

    iget-object v0, p0, Lg9/a;->j:Lr8/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lr8/k;->e(Lr8/k$c;)V

    :cond_0
    iput-object v1, p0, Lg9/a;->j:Lr8/k;

    return-void
.end method


# virtual methods
.method public d(Li8/a$b;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lg9/a;->b()V

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object v0

    const-string v1, "getBinaryMessenger(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lg9/a;->a(Lr8/c;Landroid/content/Context;)V

    return-void
.end method
