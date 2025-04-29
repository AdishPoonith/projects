.class Lk6/d$b;
.super Lk6/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lk6/d;


# direct methods
.method constructor <init>(Lk6/d;)V
    .locals 0

    iput-object p1, p0, Lk6/d$b;->a:Lk6/d;

    invoke-direct {p0}, Lk6/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/protobuf/i;)V
    .locals 1

    iget-object v0, p0, Lk6/d$b;->a:Lk6/d;

    invoke-static {v0}, Lk6/d;->a(Lk6/d;)Lk6/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk6/g;->i(Lcom/google/protobuf/i;)V

    return-void
.end method

.method public b(D)V
    .locals 1

    iget-object v0, p0, Lk6/d$b;->a:Lk6/d;

    invoke-static {v0}, Lk6/d;->a(Lk6/d;)Lk6/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lk6/g;->k(D)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lk6/d$b;->a:Lk6/d;

    invoke-static {v0}, Lk6/d;->a(Lk6/d;)Lk6/g;

    move-result-object v0

    invoke-virtual {v0}, Lk6/g;->o()V

    return-void
.end method

.method public d(J)V
    .locals 1

    iget-object v0, p0, Lk6/d$b;->a:Lk6/d;

    invoke-static {v0}, Lk6/d;->a(Lk6/d;)Lk6/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lk6/g;->s(J)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lk6/d$b;->a:Lk6/d;

    invoke-static {v0}, Lk6/d;->a(Lk6/d;)Lk6/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lk6/g;->w(Ljava/lang/CharSequence;)V

    return-void
.end method
