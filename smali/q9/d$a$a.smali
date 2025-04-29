.class Lq9/d$a$a;
.super Li9/r0$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq9/d$a;->c(Li9/j1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Li9/j1;

.field final synthetic b:Lq9/d$a;


# direct methods
.method constructor <init>(Lq9/d$a;Li9/j1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lq9/d$a$a;->b:Lq9/d$a;

    iput-object p2, p0, Lq9/d$a$a;->a:Li9/j1;

    invoke-direct {p0}, Li9/r0$i;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li9/r0$f;)Li9/r0$e;
    .locals 0

    iget-object p1, p0, Lq9/d$a$a;->a:Li9/j1;

    invoke-static {p1}, Li9/r0$e;->f(Li9/j1;)Li9/r0$e;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lq9/d$a$a;

    invoke-static {v0}, Lb5/h;->b(Ljava/lang/Class;)Lb5/h$b;

    move-result-object v0

    iget-object v1, p0, Lq9/d$a$a;->a:Li9/j1;

    const-string v2, "error"

    invoke-virtual {v0, v2, v1}, Lb5/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lb5/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lb5/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
