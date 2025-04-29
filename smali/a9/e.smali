.class public final synthetic La9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La9/c$a;


# instance fields
.field public final synthetic a:La9/l$a;

.field public final synthetic b:Lr8/k$d;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La9/l$a;Lr8/k$d;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/e;->a:La9/l$a;

    iput-object p2, p0, La9/e;->b:Lr8/k$d;

    iput-boolean p3, p0, La9/e;->c:Z

    iput-object p4, p0, La9/e;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Future;)V
    .locals 4

    iget-object v0, p0, La9/e;->a:La9/l$a;

    iget-object v1, p0, La9/e;->b:Lr8/k$d;

    iget-boolean v2, p0, La9/e;->c:Z

    iget-object v3, p0, La9/e;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, La9/l$a;->a(La9/l$a;Lr8/k$d;ZLjava/lang/String;Ljava/util/concurrent/Future;)V

    return-void
.end method
