.class final Lr8/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr8/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lr8/k$c;

.field final synthetic b:Lr8/k;


# direct methods
.method constructor <init>(Lr8/k;Lr8/k$c;)V
    .locals 0

    iput-object p1, p0, Lr8/k$a;->b:Lr8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr8/k$a;->a:Lr8/k$c;

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;Lr8/c$b;)V
    .locals 4

    iget-object v0, p0, Lr8/k$a;->b:Lr8/k;

    invoke-static {v0}, Lr8/k;->a(Lr8/k;)Lr8/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lr8/l;->e(Ljava/nio/ByteBuffer;)Lr8/j;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lr8/k$a;->a:Lr8/k$c;

    new-instance v1, Lr8/k$a$a;

    invoke-direct {v1, p0, p2}, Lr8/k$a$a;-><init>(Lr8/k$a;Lr8/c$b;)V

    invoke-interface {v0, p1, v1}, Lr8/k$c;->I(Lr8/j;Lr8/k$d;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MethodChannel#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr8/k$a;->b:Lr8/k;

    invoke-static {v1}, Lr8/k;->b(Lr8/k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Failed to handle method call"

    invoke-static {v0, v1, p1}, Ld8/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lr8/k$a;->b:Lr8/k;

    invoke-static {v0}, Lr8/k;->a(Lr8/k;)Lr8/l;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p1}, Ld8/b;->d(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "error"

    invoke-interface {v0, v3, v1, v2, p1}, Lr8/l;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {p2, p1}, Lr8/c$b;->a(Ljava/nio/ByteBuffer;)V

    :goto_0
    return-void
.end method
