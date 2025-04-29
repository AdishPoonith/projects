.class public final synthetic Lw8/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lr8/d$b;

.field public final synthetic k:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lr8/d$b;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/n;->j:Lr8/d$b;

    iput-object p2, p0, Lw8/n;->k:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw8/n;->j:Lr8/d$b;

    iget-object v1, p0, Lw8/n;->k:Ljava/util/Map;

    invoke-static {v0, v1}, Lw8/o;->d(Lr8/d$b;Ljava/util/Map;)V

    return-void
.end method
