.class public final synthetic Lq0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lq0/a;

.field public final synthetic k:Lq0/d;


# direct methods
.method public synthetic constructor <init>(Lq0/a;Lq0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/g;->j:Lq0/a;

    iput-object p2, p0, Lq0/g;->k:Lq0/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq0/g;->j:Lq0/a;

    iget-object v1, p0, Lq0/g;->k:Lq0/d;

    invoke-static {v0, v1}, Lq0/m;->c(Lq0/a;Lq0/d;)V

    return-void
.end method
