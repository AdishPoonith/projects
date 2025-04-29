.class Lq9/e$h;
.super Li9/r0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq9/e$h$a;,
        Lq9/e$h$b;
    }
.end annotation


# instance fields
.field private final a:Li9/r0$i;

.field final synthetic b:Lq9/e;


# direct methods
.method constructor <init>(Lq9/e;Li9/r0$i;)V
    .locals 0

    iput-object p1, p0, Lq9/e$h;->b:Lq9/e;

    invoke-direct {p0}, Li9/r0$i;-><init>()V

    iput-object p2, p0, Lq9/e$h;->a:Li9/r0$i;

    return-void
.end method


# virtual methods
.method public a(Li9/r0$f;)Li9/r0$e;
    .locals 3

    iget-object v0, p0, Lq9/e$h;->a:Li9/r0$i;

    invoke-virtual {v0, p1}, Li9/r0$i;->a(Li9/r0$f;)Li9/r0$e;

    move-result-object p1

    invoke-virtual {p1}, Li9/r0$e;->c()Li9/r0$h;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Lq9/e$h$b;

    invoke-virtual {v0}, Li9/r0$h;->c()Li9/a;

    move-result-object v1

    invoke-static {}, Lq9/e;->k()Li9/a$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Li9/a;->b(Li9/a$c;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq9/e$b;

    invoke-direct {p1, p0, v1}, Lq9/e$h$b;-><init>(Lq9/e$h;Lq9/e$b;)V

    invoke-static {v0, p1}, Li9/r0$e;->i(Li9/r0$h;Li9/k$a;)Li9/r0$e;

    move-result-object p1

    :cond_0
    return-object p1
.end method
