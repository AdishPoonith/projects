.class public final synthetic Lw8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lr8/d$b;

.field public final synthetic k:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Lr8/d$b;Ljava/util/HashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/m;->j:Lr8/d$b;

    iput-object p2, p0, Lw8/m;->k:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw8/m;->j:Lr8/d$b;

    iget-object v1, p0, Lw8/m;->k:Ljava/util/HashMap;

    invoke-static {v0, v1}, Lw8/o;->g(Lr8/d$b;Ljava/util/HashMap;)V

    return-void
.end method
