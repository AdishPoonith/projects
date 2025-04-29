.class Le8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le8/a;


# direct methods
.method constructor <init>(Le8/a;)V
    .locals 0

    iput-object p1, p0, Le8/a$a;->a:Le8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;Lr8/c$b;)V
    .locals 1

    iget-object p2, p0, Le8/a$a;->a:Le8/a;

    sget-object v0, Lr8/t;->b:Lr8/t;

    invoke-virtual {v0, p1}, Lr8/t;->c(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Le8/a;->h(Le8/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Le8/a$a;->a:Le8/a;

    invoke-static {p1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le8/a$a;->a:Le8/a;

    invoke-static {p1}, Le8/a;->i(Le8/a;)Le8/a$d;

    move-result-object p1

    iget-object p2, p0, Le8/a$a;->a:Le8/a;

    invoke-static {p2}, Le8/a;->g(Le8/a;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Le8/a$d;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
