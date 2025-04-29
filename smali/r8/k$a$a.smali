.class Lr8/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr8/k$a;->a(Ljava/nio/ByteBuffer;Lr8/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr8/c$b;

.field final synthetic b:Lr8/k$a;


# direct methods
.method constructor <init>(Lr8/k$a;Lr8/c$b;)V
    .locals 0

    iput-object p1, p0, Lr8/k$a$a;->b:Lr8/k$a;

    iput-object p2, p0, Lr8/k$a$a;->a:Lr8/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lr8/k$a$a;->a:Lr8/c$b;

    iget-object v1, p0, Lr8/k$a$a;->b:Lr8/k$a;

    iget-object v1, v1, Lr8/k$a;->b:Lr8/k;

    invoke-static {v1}, Lr8/k;->a(Lr8/k;)Lr8/l;

    move-result-object v1

    invoke-interface {v1, p1}, Lr8/l;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Lr8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lr8/k$a$a;->a:Lr8/c$b;

    iget-object v1, p0, Lr8/k$a$a;->b:Lr8/k$a;

    iget-object v1, v1, Lr8/k$a;->b:Lr8/k;

    invoke-static {v1}, Lr8/k;->a(Lr8/k;)Lr8/l;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Lr8/l;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Lr8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lr8/k$a$a;->a:Lr8/c$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lr8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method
