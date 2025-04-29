.class Lq9/e$h$b;
.super Li9/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/e$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private final a:Lq9/e$b;

.field final synthetic b:Lq9/e$h;


# direct methods
.method constructor <init>(Lq9/e$h;Lq9/e$b;)V
    .locals 0

    iput-object p1, p0, Lq9/e$h$b;->b:Lq9/e$h;

    invoke-direct {p0}, Li9/k$a;-><init>()V

    iput-object p2, p0, Lq9/e$h$b;->a:Lq9/e$b;

    return-void
.end method


# virtual methods
.method public a(Li9/k$b;Li9/y0;)Li9/k;
    .locals 1

    new-instance p1, Lq9/e$h$a;

    iget-object p2, p0, Lq9/e$h$b;->b:Lq9/e$h;

    iget-object v0, p0, Lq9/e$h$b;->a:Lq9/e$b;

    invoke-direct {p1, p2, v0}, Lq9/e$h$a;-><init>(Lq9/e$h;Lq9/e$b;)V

    return-object p1
.end method
