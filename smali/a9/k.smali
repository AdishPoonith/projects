.class public final synthetic La9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:La9/l$a;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La9/l$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La9/k;->a:La9/l$a;

    iput-object p2, p0, La9/k;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La9/k;->a:La9/l$a;

    iget-object v1, p0, La9/k;->b:Ljava/lang/String;

    invoke-static {v0, v1}, La9/l$a;->h(La9/l$a;Ljava/lang/String;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
