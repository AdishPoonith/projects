.class public final synthetic La1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lq0/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lq0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/b;->j:Ljava/lang/String;

    iput-object p2, p0, La1/b;->k:Lq0/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La1/b;->j:Ljava/lang/String;

    iget-object v1, p0, La1/b;->k:Lq0/d;

    invoke-static {v0, v1}, La1/c;->b(Ljava/lang/String;Lq0/d;)V

    return-void
.end method
