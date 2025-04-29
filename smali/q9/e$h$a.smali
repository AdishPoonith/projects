.class Lq9/e$h$a;
.super Li9/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/e$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Lq9/e$b;

.field final synthetic b:Lq9/e$h;


# direct methods
.method public constructor <init>(Lq9/e$h;Lq9/e$b;)V
    .locals 0

    iput-object p1, p0, Lq9/e$h$a;->b:Lq9/e$h;

    invoke-direct {p0}, Li9/k;-><init>()V

    iput-object p2, p0, Lq9/e$h$a;->a:Lq9/e$b;

    return-void
.end method


# virtual methods
.method public i(Li9/j1;)V
    .locals 1

    iget-object v0, p0, Lq9/e$h$a;->a:Lq9/e$b;

    invoke-virtual {p1}, Li9/j1;->o()Z

    move-result p1

    invoke-virtual {v0, p1}, Lq9/e$b;->g(Z)V

    return-void
.end method
