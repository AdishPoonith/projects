.class public final synthetic Lq3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq3/x$a;

.field public final synthetic k:Lq3/z;


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;Lq3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/t;->j:Lq3/x$a;

    iput-object p2, p0, Lq3/t;->k:Lq3/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq3/t;->j:Lq3/x$a;

    iget-object v1, p0, Lq3/t;->k:Lq3/z;

    invoke-static {v0, v1}, Lq3/x$a;->h(Lq3/x$a;Lq3/z;)V

    return-void
.end method
