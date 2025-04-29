.class public final synthetic Lq3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq3/x$a;

.field public final synthetic k:Lv1/e;


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;Lv1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/w;->j:Lq3/x$a;

    iput-object p2, p0, Lq3/w;->k:Lv1/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq3/w;->j:Lq3/x$a;

    iget-object v1, p0, Lq3/w;->k:Lv1/e;

    invoke-static {v0, v1}, Lq3/x$a;->d(Lq3/x$a;Lv1/e;)V

    return-void
.end method
