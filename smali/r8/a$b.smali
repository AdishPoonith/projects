.class final Lr8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Lr8/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr8/a$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic b:Lr8/a;


# direct methods
.method private constructor <init>(Lr8/a;Lr8/a$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr8/a$d<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lr8/a$b;->b:Lr8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr8/a$b;->a:Lr8/a$d;

    return-void
.end method

.method synthetic constructor <init>(Lr8/a;Lr8/a$d;Lr8/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr8/a$b;-><init>(Lr8/a;Lr8/a$d;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;Lr8/c$b;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lr8/a$b;->a:Lr8/a$d;

    iget-object v1, p0, Lr8/a$b;->b:Lr8/a;

    invoke-static {v1}, Lr8/a;->a(Lr8/a;)Lr8/i;

    move-result-object v1

    invoke-interface {v1, p1}, Lr8/i;->b(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    new-instance v1, Lr8/a$b$a;

    invoke-direct {v1, p0, p2}, Lr8/a$b$a;-><init>(Lr8/a$b;Lr8/c$b;)V

    invoke-interface {v0, p1, v1}, Lr8/a$d;->a(Ljava/lang/Object;Lr8/a$e;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BasicMessageChannel#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr8/a$b;->b:Lr8/a;

    invoke-static {v1}, Lr8/a;->b(Lr8/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Failed to handle message"

    invoke-static {v0, v1, p1}, Ld8/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lr8/c$b;->a(Ljava/nio/ByteBuffer;)V

    :goto_0
    return-void
.end method
