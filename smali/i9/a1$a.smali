.class Li9/a1$a;
.super Li9/a1$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/a1;->e(Li9/a1$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Li9/a1$f;

.field final synthetic b:Li9/a1;


# direct methods
.method constructor <init>(Li9/a1;Li9/a1$f;)V
    .locals 0

    iput-object p1, p0, Li9/a1$a;->b:Li9/a1;

    iput-object p2, p0, Li9/a1$a;->a:Li9/a1$f;

    invoke-direct {p0}, Li9/a1$e;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Li9/j1;)V
    .locals 1

    iget-object v0, p0, Li9/a1$a;->a:Li9/a1$f;

    invoke-interface {v0, p1}, Li9/a1$f;->b(Li9/j1;)V

    return-void
.end method

.method public c(Li9/a1$g;)V
    .locals 2

    iget-object v0, p0, Li9/a1$a;->a:Li9/a1$f;

    invoke-virtual {p1}, Li9/a1$g;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Li9/a1$g;->b()Li9/a;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Li9/a1$f;->a(Ljava/util/List;Li9/a;)V

    return-void
.end method
