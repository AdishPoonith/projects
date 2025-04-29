.class Lp6/w$c;
.super Li9/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/w;->k(Lp6/w$e;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp6/w$e;

.field final synthetic b:Li9/g;

.field final synthetic c:Lp6/w;


# direct methods
.method constructor <init>(Lp6/w;Lp6/w$e;Li9/g;)V
    .locals 0

    iput-object p1, p0, Lp6/w$c;->c:Lp6/w;

    iput-object p2, p0, Lp6/w$c;->a:Lp6/w$e;

    iput-object p3, p0, Lp6/w$c;->b:Li9/g;

    invoke-direct {p0}, Li9/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li9/j1;Li9/y0;)V
    .locals 0

    iget-object p2, p0, Lp6/w$c;->a:Lp6/w$e;

    invoke-virtual {p2, p1}, Lp6/w$e;->a(Li9/j1;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lp6/w$c;->a:Lp6/w$e;

    invoke-virtual {v0, p1}, Lp6/w$e;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lp6/w$c;->b:Li9/g;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Li9/g;->c(I)V

    return-void
.end method
